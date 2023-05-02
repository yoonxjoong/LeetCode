import hashlib

class Codec:
    def __init__(self):
        self.url_dict = {}
        self.base_url = "http://tinyurl.com/"
        
    def encode(self, longUrl: str) -> str:
        hash = hashlib.sha256(longUrl.encode()).hexdigest()[:8]
        self.url_dict[hash] = longUrl
        return self.base_url + hash
        
    def decode(self, shortUrl: str) -> str:
        hash = shortUrl.split('/')[-1]
        return self.url_dict[hash]
        

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))