package pages.release

import geb.Page

class ComponentChangeLog extends Page {
	static url =  "changelog"
	
	static at = {
		title ==~ /Changelog/
	}
	
	static content = {
		
	}
}