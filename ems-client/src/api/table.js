import request from '@/utils/request'

export function getEqu(params) {
  return request({
    url: '/table/list',
    method: 'get',
    params
  })
}

export function getEmp(params) {
  return request({
    url: '/employee/list',
    method: 'get',
    params
  })
}
