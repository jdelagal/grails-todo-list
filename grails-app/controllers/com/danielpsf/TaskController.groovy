package com.danielpsf

import grails.converters.JSON

class TaskController {
	static allowedMethods = [list : 'GET']
	
	def list() {
        log.info "test"
		render Task.list() as JSON
	}
    def index() { }
}
