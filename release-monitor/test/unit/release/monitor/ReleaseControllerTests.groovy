package release.monitor



import grails.test.mixin.*
import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ReleaseController)
@Mock(ReleaseId)
class ReleaseControllerTests {

    //setup mocks
	@Before
	public void setup () {
		//super.setup ()
		def r1 = new ReleaseId(buildId: "1.0.1-100", component: "CP")
		def r2 = new ReleaseId(buildId: "1.0.1-200", component: "CP")
		//ReleaseId.create()
	}
	
	//index shows the list
	
	void testIndex() {
		controller.index()
		assert view == "/release"
	}
	
	//changelog returns map of matching releases
	void testChangelog() {
		mockDomain(ReleaseId, [
			[buildId: "1.0.1-100", component: "CP"],
			[buildId: "1.0.1-200", component: "CP"],
			[buildId: "1.0.1-500", component: "RAE"]])
		params.component = "CP"
		controller.changelog()
		
		assert view == "/release/changelog"
		//assert model returned
		assert model.releaseList
		
		//assert model returns only 2 items
	}
}
