class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        glass_t_value = 0
        glass_t_index = 0

        paper_t_value = 0
        paper_t_index = 0

        metal_t_value = 0
        metal_t_index = 0

        for index, item in enumerate(garbage):
            print(item, index)

            if item.count('G') > 0:
                glass_t_value += item.count('G')
                glass_t_index = index

            if item.count('P') > 0:
                paper_t_value += item.count('P')
                paper_t_index = index

            if item.count('M') > 0:
                metal_t_value += item.count('M')
                metal_t_index = index

        return glass_t_value + sum(travel[:glass_t_index]) + paper_t_value + sum(travel[:paper_t_index]) + metal_t_value + sum(travel[:metal_t_index])




























