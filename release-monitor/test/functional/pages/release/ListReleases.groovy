package pages.release

import geb.Page

class ListReleases extends Page {
	static url =  "release/list"
	
	static at = {
		title ==~ /ReleaseId List/
	}
	
	static content = {
		
	}
}