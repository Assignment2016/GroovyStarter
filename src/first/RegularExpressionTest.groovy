package first

class RegularExpressionTest {

	
	static void main(def args){
	def text = "Registry Lapins Agiles Lab "
	
	// every word must be followed by a non word character
	if (text==~/(\w*\W+)*/){
		println "Match was successful"
	} else {
		println "Match was not successful"

}}}
