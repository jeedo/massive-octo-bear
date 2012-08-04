package release.monitor

class ReleaseId {
	String buildId
	Date logDate
	String component
	String env 

    static constraints = {
		buildId(blank: false)
    }
}
