package steps

import static org.junit.Assert.assertTrue
this.metaClass.mixin (cucumber.runtime.groovy.Hooks)
this.metaClass.mixin (cucumber.runtime.groovy.EN)

import pages.release.ListReleases

Given(~'^a component has observed release information$'){ ->
	to ListReleases
	at ListReleases
}

When(~'viewing the component detailed history page$'){ ->
	assert false
}

Then(~'it should show "([^"]*)", "([^"]*)", "([^"]*)"$'){ String arg1, String arg2, String arg3 ->
	assert false
}