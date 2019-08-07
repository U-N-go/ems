/**
 * 设备信息表
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
      <el-table-column align="center" label="设备ID" width="80">
        <template slot-scope="scope">
          {{ scope.$index }}
        </template>
      </el-table-column>
      <el-table-column align="center" label="设备型号" width="200">
        <template slot-scope="scope">
          {{ scope.row.type }}
        </template>
      </el-table-column>
      <el-table-column align="center" label="资产编号" width="300">
        <template slot-scope="scope">
          <span>{{ scope.row.code }}</span>
        </template>
      </el-table-column>
      <el-table-column label="设备位置" width="120" align="center">
        <template slot-scope="scope">
          {{ scope.row.position }}
        </template>
      </el-table-column>
      <el-table-column class-name="status-col" label="生产厂家" width="120" align="center">
        <template slot-scope="scope">
          {{ scope.row.producer }}
        </template>
      </el-table-column>
      <el-table-column align="center" prop="created_at" label="购买日期" width="150">
        <template slot-scope="scope">
          <i class="el-icon-time" />
          <span>{{ scope.row.buy_date }}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" prop="created_at" label="保修日期" width="150">
        <template slot-scope="scope">
          <i class="el-icon-time" />
          <span>{{ scope.row.warranty_date }}</span>
        </template>
      </el-table-column>
      <el-table-column label="持有者" width="110" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.author }}</span>
        </template>
      </el-table-column>
      <el-table-column class-name="status-col" label="售后联系人" width="120" align="center">
        <template slot-scope="scope">
          {{ scope.row.contactor }}
        </template>
      </el-table-column>
      <el-table-column class-name="status-col" label="联系电话" width="200" align="center">
        <template slot-scope="scope">
          {{ scope.row.number }}
        </template>
      </el-table-column>
      <el-table-column class-name="status-col" label="操作" width="100" align="center">
        <template>
          <el-button type="primary" icon="el-icon-edit" circle />
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import { getEqu } from '@/api/table'

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
      getEqu().then(response => {
        this.list = response.data.items
        this.listLoading = false
      })
    }
  }
}
</script>
