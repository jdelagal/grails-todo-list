package com.danielpsf

class Task {
	String description
	Boolean done
	
    static constraints = {
		description blank: false
    }
	
	static mapping = {
		done defaultValue: false
	}
}
