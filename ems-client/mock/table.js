import Mock from 'mockjs'

const data = Mock.mock({
  'items|30': [{
    id: '@id',
    type: '@sentence(10)',
    'status|1': ['published', 'draft', 'deleted'],
    code: '@sentence(10,15)',
    'position|1': [
      '人事部门',
      '机械部门',
      '电气部门',
      '软件部门'
    ],
    'producer|1': [
      '华硕',
      '联想',
      '苹果',
      '惠普',
      '戴尔'
    ],
    buy_date: '@date',
    warranty_date: '@date',
    author: 'name',
    contactor: 'name',
    number: '@phone',
    pageviews: '@integer(300, 5000)'
  }]
})

export default [
  {
    url: '/table/list',
    type: 'get',
    response: config => {
      const items = data.items
      return {
        code: 20000,
        data: {
          total: items.length,
          items: items
        }
      }
    }
  }
]
