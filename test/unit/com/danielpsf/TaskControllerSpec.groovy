
package com.danielpsf
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(TaskController)
@Mock(Task)
class TaskControllerSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	void "Should list all tasks"() {
		given:
		Task task = new Task(description: "some task", done: true).save()
		
		when:
		def tasks = controller.list()
		
		then:
		response.json != []
		response.json[0].description == "some task"
	}
}
