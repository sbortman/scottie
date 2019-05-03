<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="mapWidget.css"/>
</head>
<body>
<div class="content">
    <h1>${myTitle}</h1>
    <div id="map"></div>
</div>
<asset:javascript src="mapWidget.js"/>
<asset:script>
    $(document).ready(function() {
    var mapParams = ${raw(mapParams?.encodeAsJSON()?.toString())};
    MapWidget.init(mapParams);
    });
</asset:script>
<asset:deferredScripts/>
</body>
</html>