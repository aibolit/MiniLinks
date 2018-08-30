function ready(fn) {
    if (document.attachEvent ? document.readyState === "complete" : document.readyState !== "loading") {
        fn();
    } else {
        document.addEventListener('DOMContentLoaded', fn);
    }
}

function copyTextToClipboard(text) {
    if (!navigator.clipboard) {
        var textArea = document.createElement("textarea");
        textArea.value = text;
        document.body.appendChild(textArea);
        textArea.focus();
        textArea.select();
        try {
            var successful = document.execCommand('copy');
            var msg = successful ? 'successful' : 'unsuccessful';
        } catch (err) {
            console.error('Fallback: Oops, unable to copy', err);
        }
        document.body.removeChild(textArea);
        return;
    }
    navigator.clipboard.writeText(text).then(function () {}, function (err) {
        console.error('Async: Could not copy text: ', err);
    });
}

ready(evt => {
    document.querySelector(".link-label").textContent = window.location.origin + "/";
    document.querySelectorAll("a").forEach(n => {
        var alias = window.location.origin + "/" + n.getAttribute('alias');

        n.textContent = alias;
        n.setAttribute('href', alias);

        document.querySelectorAll(".copy-link").forEach(l => {
            l.onclick = evt => {
                l.classList.remove('copy-link-copied');
                copyTextToClipboard(alias);
                l.classList.add('copy-link-copied');
            };
        });
    })
});