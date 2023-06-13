class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        alphabet = 'abcdefghijklmnopqrstuvwxyz'
        key = key.replace(' ', '')
        result = {}
        seen = set()

        for char in key:
            if char.isalpha() and char not in seen:
                seen.add(char)
                result[char] = alphabet[len(seen) - 1]
        
        decoded_message = ''
        for char in message:
            if char in result:
                decoded_message += result[char]
            else:
                decoded_message += char

        return decoded_message
                
    
            
