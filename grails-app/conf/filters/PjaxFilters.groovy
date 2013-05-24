
class PjaxFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                request.isPjax = request.getHeader("X-PJAX")
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
