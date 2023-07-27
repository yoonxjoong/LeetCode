class Solution:
    def maximum69Number (self, num: int) -> int:
        number_str = list(str(num))  # 문자열을 리스트로 변환
        tmp = []
        tmp.append("".join(number_str))
        for i in range(len(number_str)):
            tmp_number = list(str(num))
            if number_str[i] == "6":
                tmp_number[i] = "9"
            elif number_str[i] == "9":
                tmp_number[i] = "6"
            result_str = "".join(tmp_number)  # 리스트를 다시 문자열로 변환
            tmp.append(result_str)
        
        return int(max(tmp))
      
        