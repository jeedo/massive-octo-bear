package release.monitor

class ReleaseController {

    def scaffold = ReleaseId
	
	def changelog() {
		println params.component
		def releaseList = ReleaseId.findAllByComponent(params.component)
		//check that the ReleaseList is not empty
		println releaseList.size()
		
		[ releaseList: releaseList ]
	}
}
