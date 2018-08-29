<!doctype html>
<html>
<head>
    <title>New Link</title>
    <asset:javascript src="l.js" />
    <asset:stylesheet src="l.css" />
</head>
<body>
<g:form action="create" controller="l">
<table>
    <tr><td><label class="url-label" for="url">URL:</label></td><td><g:textField name="url" /></td></tr>
    <tr><td><label class="link-label" for="link"></label></td><td><g:textField name="alias" placeholder="${
        (1..6).collect{ def l =  (('a'..'z') + ('A'..'Z')  + ('0'..'9')); l[ (Math.random() * l.size()) as Integer ]  } .join()
    }" /></td></tr>
    <tr><td colspan="2"><g:submitButton name="create" value="create" class="create-input" /></td></tr>
    </table>
</g:form>
</body>
</head>
</html>