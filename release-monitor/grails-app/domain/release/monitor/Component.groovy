package release.monitor

class Component {
	String Name
	String LongName
	
	static belongsTo = [ReleaseId]

    static constraints = {
    }
}
