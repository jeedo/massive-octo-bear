package release.monitor



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ReleaseId)
class ReleaseIdTests {

	void setUp(){
		ReleaseId.list()*.delete()
	}
	void testPersist() {
		new ReleaseId(buildId: "1.2.1-100", logDate: new Date(), component: "RAE", env: "DEV").save()
		new ReleaseId(buildId: "1.2.1-101", logDate: new Date(), component: "RAE", env: "DEV").save()
		new ReleaseId(buildId: "1.2.1-102", logDate: new Date(), component: "RAE", env: "DEV").save()
		new ReleaseId(buildId: "1.2.1-103", logDate: new Date(), component: "RAE", env: "DEV").save()
		new ReleaseId(buildId: "1.2.1-104", logDate: new Date(), component: "RAE", env: "DEV").save()
		
		assert 5 == ReleaseId.count()
		
		def actualRel = ReleaseId.findByBuildId('1.2.1-100')
		assert actualRel
		assert '1.2.1-100' == actualRel.buildId
	}
}
