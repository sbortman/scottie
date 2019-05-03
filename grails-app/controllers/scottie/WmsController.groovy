package scottie

class WmsController
{
	WmsService wmsService
	
	def index()
	{
		println params
		render contentType: 'image/png', file: wmsService.createTile(params)
	}
}
