<!doctype html>
<html>

<head>
    <title>New Link</title>
<asset:javascript src="l.js"/>
<asset:stylesheet src="l.css"/>
</head>

<body>
<div class="root" action="create" controller="l">
    <table style="margin: auto;">
        <g:if test="${flash.message}">
            <tr style="text-align: center">
                <td colspan="2"><label style='color: ${flash.color}'>${flash.message}</label><g:if test="${flash.alias}"><a alias="${flash.alias}"></a><label class="copy-link">&#128203;</label></g:if>
                </td>
            </tr>
        </g:if>
        <g:if test="${flash.type == "EXISTS"}">
            <tr>
                <td colspan="2">
                    <g:form class="override-form" action="create" controller="l">
                        <label>Set</label>
                        <label class="link-label" style="color: #CCC"></label><label style="color: #CCC">${flash.alias}</label>
                        <label>to be</label>
                        <label style="color: #CCC">${flash.url}</label>
                        <g:submitButton name="create" value="Override" class="create-input"/>

                        <div style="display: none">
                            <input type="text" name="overrideAlias" id="override-alias" value="${flash.alias}"/>
                            <input type="text" name="overrideUrl" id="override-url" value="${flash.url}"/>
                        </div>
                    </g:form>
                </td>
            </tr>
        </g:if>
    </table>
    <g:form class="root-form" action="create" controller="l" style="margin-top: 10px">
        <table style="margin: auto">
            <tr>
                <td style="text-align: right;"><label class="url-label" for="url">URL</label></td>
                <td><input name="url" id="url" maxlength="1000" required="true" type="url"/></td>
            </tr>
            <tr>
                <td><label class="link-label"></label></td>
                <td><input type="text" id="alias" name="alias" minlength="2" maxlength="64"
                           placeholder="${placeholder = (1..6).collect { def l = (('a'..'z') + ('A'..'Z') + ('0'..'9')); l[(Math.random() * l.size()) as Integer] } .join()}"/></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <g:submitButton name="create" value="Create" class="create-input"/>
                </td>
            </tr>
        </table>
    </g:form>
    <div style="display:none"><input type="text" id="placeholder" name="placeholder" value="${placeholder}"></div>
</div>
</body>
</head>

</html>