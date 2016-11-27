package first

class CallMethods {

	static main(args) {
		def mymap = [1:"Bour Antoine", 2:"Bour Wallace", 3:"Bour Maya"]
		mymap.each {entry -> println (entry.key > 1)}
		mymap.each {entry -> println (entry.value.contains("o"))}
		println "Bour contained:" + mymap.any {entry -> entry.value.contains("Bour")}
		println "Every key small than 6:" + mymap.every {entry -> entry.key < 6}

		def result =''
		for (key in mymap.keySet()) {
				result += key
		}
		println result

		mymap.each { key, value ->
				print key + "FF"
				println value
		}

		mymap.each { entry ->
				print entry.key + "GG"
				println entry.value
		}
}

	
}
