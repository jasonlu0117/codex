package com.text.codex.util;

/**
 * 使用jsr-bean验证规范
 */
@SuppressWarnings(value = "all")
public interface VG {

    // 分页
    interface Page{
    }

    // 新增
    interface Add {
    }

    // 删除
    interface Delete {
    }

    // 查询单条记录
    interface Get {
    }

    // 列表查询
    interface List {
    }

    // 更新
    interface Update {
    }

    //编辑
    interface Edit{
    }

    // 登录
    interface Login {
    }

    // 密码
    interface Passwd{
    }

    // 验证测试
    interface ValiTest {
    }
    // 验证开库
    interface ValiOpen {
    }

    // 验证分配
    interface ValiDistr {
    }

    // 验证添加/删除角色权限时的参数
    interface ValidRolePermission {
    }

    // 验证添加/删除用户角色时的参数
    interface ValidUserRole {
    }

    // 验证添加/删除用户部门时的参数
    interface ValidUserDepartment {
    }

    // 判断数据归集是否可用时的参数
    interface ValidDataCollectionAvailable {
    }

    // 判断外部调用工单接口
    interface ExternalWorkOrder {
    }

    // 外部工单新增
    interface WorkOrderProvideAdd {
    }

    // 工单更新
    interface WorkOrderUpdateById {
    }

    // 获取详情
    interface GetInfo {
    }

    interface TaskOrderPendingOptions {
    }

    interface TaskOrderHandle {
    }

    interface TaskOrderHandleList {
    }

    interface TaskOrderProcessList {
    }

    interface TaskOrderProcessId {
    }

    interface TaskOrderOverview {
    }

    interface Withdraw {
    }

    interface LeaderViewFuzzyQuery{

    }

    // 校验接口资源的授权信息
    interface ApplyId {
    }

    // 第三方add
    interface TpAdd {
    }

    interface TpSelect{

    }

    // 第三方update
    interface TpUpdate {
    }
    // 第三方delete
    interface TpDelete {
    }

    // 工单评价状态
    interface EvaluationStatus {
    }

    // 工单评价批量添加
    interface EvaluationBatchAdd {
    }

    // 工单评价选项批量添加
    interface EvaluationOptionBatchAdd {
    }

    // 验证统一社会信用代码
    interface vaildUniformCreditCode {
    }

}
