from PIL import Image
import base64
import requests
from io import BytesIO
from urllib.request import urlopen


url = 'https://s.pstatic.net/static/www/u/2014/0328/mma_20432863.png'
b64_data='iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHElEQVQI12P4//8/w38GIAXDIBKE0DHxgljNBAAO9TXL0Y4OHwAAAABJRU5ErkJggg=='
img = Image.open(urlopen(url))
img_bytes= img.tobytes()
encoded = base64.b64encode(img_bytes)
encoded

# decoded= encoded.decode()
# decoded


im_file = BytesIO()
img.save(im_file, format="PNG")
im_bytes = im_file.getvalue()  # im_bytes: image in binary format.
im_b64 = base64.b64encode(im_bytes)

im_b64


