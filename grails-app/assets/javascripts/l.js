function ready(fn) {
    if (document.attachEvent ? document.readyState === "complete" : document.readyState !== "loading") {
        fn();
    } else {
        document.addEventListener('DOMContentLoaded', fn);
    }
}


ready(evt => {
    document.querySelector(".link-label").textContent = window.location.origin + "/";
});