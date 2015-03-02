package filters
class PjaxFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                request.isPjax = request.getHeader("X-PJAX")
            }
        }
    }
}
