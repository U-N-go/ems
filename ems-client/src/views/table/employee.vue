/**
 * 员工信息表
 * @ 武康康
 */
<template>
  <div class="app-container">
    <el-table
      v-loading="listLoading"
      :data="list"
      element-loading-text="Loading"
      border
      fit
      highlight-current-row
    >
      <el-table-column align="center" label="ID" width="80">
        <template slot-scope="scope">{{ scope.$index }}</template>
      </el-table-column>
      <el-table-column align="center" label="用户名" width="150">
        <template slot-scope="scope">{{ scope.row.name }}</template>
      </el-table-column>
      <el-table-column align="center" label="设备型号" width="200">
        <template slot-scope="scope">
          <span>{{ scope.row.type }}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" label="领取时间" width="150">
        <template slot-scope="scope">
          <i class="el-icon-time" />
          <span>{{ scope.row.take_date }}</span>
        </template>
      </el-table-column>
      <el-table-column class-name="status-col" label="密码" width="200" align="center">
        <template slot-scope="scope">{{ scope.row.password }}</template>
      </el-table-column>
      <el-table-column align="center" prop="created_at" label="联系电话" width="200">
        <template slot-scope="scope">
          <span>{{ scope.row.phone }}</span>
        </template>
      </el-table-column>
      <el-table-column class-name="status-col" label="操作" width="150" align="center">
        <template>
          <el-button type="primary" icon="el-icon-edit" circle />
          <el-button type="danger" icon="el-icon-delete" circle />
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import { getEmp } from '@/api/table'

export default {
  filters: {
    statusFilter(status) {
      const statusMap = {
        published: 'success',
        draft: 'gray',
        deleted: 'danger'
      }
      return statusMap[status]
    }
  },
  data() {
    return {
      list: null,
      listLoading: true
    }
  },
  created() {
    this.fetchData()
  },
  methods: {
    fetchData() {
      this.listLoading = true
      getEmp().then(response => {
        this.list = response.data.items
        this.listLoading = false
      })
    }
  }
}
</script>
