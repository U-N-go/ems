import Mock from 'mockjs'

const data = Mock.mock({
  'items|30': [{
    id: '@id',
    name: '@name',
    type: '@sentence(10)',
    take_date: '@date',
    password: '@sentence(5)',
    phone: '@phone'
  }]
})

export default [
  {
    url: '/employee/list',
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
