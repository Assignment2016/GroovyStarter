package first

class PrintFileToConsole {

	static main (args){
	// write the content of the file to the console
	File file2 = new File(".src/first/output.txt")
	file2.write "Hello\n"
	file2.append "Testing\n"
	file2 << "More appending...\n"
	File result = new File(".src/first/output.txt")
	println (result.text)
	// clean-up
	file2.delete()
	}
}
