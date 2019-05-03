package scottie

import javax.imageio.ImageIO
import java.awt.*
import java.awt.image.BufferedImage

class WmsService
{
	def createTile( Map<String, Object> params )
	{
		Integer width = params?.WIDTH?.toInteger()
		Integer height = params?.HEIGHT?.toInteger()
		String format = params?.FORMAT
		
		BufferedImage image = new BufferedImage( width, height, BufferedImage.TYPE_INT_ARGB )
		ByteArrayOutputStream ostream = new ByteArrayOutputStream()
		
		Graphics2D g2d = image.createGraphics()
		
		g2d.color = Color.red
		g2d.drawRect( 0, 0, 255, 255 )
		g2d.dispose()
		
		ImageIO.write( image, format?.split( '/' )?.last(), ostream )
		ostream.toByteArray()
	}
}
