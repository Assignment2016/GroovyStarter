package first

class PrintConsole {

	static main (args){
		
		File file = new File("./src/first/test.txt")
		file.eachLine{ line -> println line }
		
		// adds a line number in front of each line to the console
		def lineNumber = 0
		file = new File("./src/first/test.txt")
		file.eachLine{ line ->
				lineNumber++
				println "$lineNumber: $line"
		}
		
		// read the file into a String
		String s = new File("./src/first/test.txt").text
		println s
		
	}
	
}
