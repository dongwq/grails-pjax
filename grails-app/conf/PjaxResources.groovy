modules = {

    // resource id:'js', url:[plugin: 'jqueryUi', dir:'jquery-ui/js', file:"jquery-ui-${jqver}.custom.js"]
    pjax {
        dependsOn 'jquery'
        resource url:'js/jquery.pjax.js'
    }

}