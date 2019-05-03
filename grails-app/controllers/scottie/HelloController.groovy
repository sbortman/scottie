package scottie

class HelloController
{
	def greetingService
	
	def index()
	{
		render contextType: 'text/plain', text: greetingService.createGreeting( params )
	}
}
