package scottie

class GreetingService
{
	def createGreeting( def params )
	{
		"Hello ${ params.name ?: 'World' }!"
	}
}
