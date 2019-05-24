<h1>API接口文档</h1>
<br>
<#list controller as controller >
    <h3>${controller_index+1}、${controller.name}</h3>

    <#list controller.apis as api >
        <h4>${controller_index+1}-${api_index+1}、${api.operations[0].summary}</h4>
        <style>
            table,table tr th, table tr td { border:1px solid;}
        </style>

        <table style="border-collapse: collapse;">
            <tr>
                <th>名称</th>
                <td colspan="12">${api.operations[0].summary}</td>
            </tr>
            <tr>
                <th>URL样式</th>
                <td colspan="12">${api.path}</td>
            </tr>
            <tr>
                <th>提交方式</th>
                <td colspan="12">${api.operations[0].method}</td>
            </tr>
            <tr>
                <th>接口协议</th>
                <td colspan="12">HTTP+JSON</td>
            </tr>
            <tr>
                <th>内容类型</th>
                <td colspan="12">application/json</td>
            </tr>
            <tr>
                <#if api.operations[0].paramsBody?exists>
                    <th rowspan=${1+api.operations[0].params?size+api.operations[0].paramsBody.fields?size}>提交资源数据</th>
                <#else>
                    <th rowspan=${1+api.operations[0].params?size}>提交资源数据</th>
                </#if>
                <th colspan="3">名称</th>
                <th colspan="3">是否必须</th>
                <th colspan="3">类型</th>
                <th colspan="3">描述</th>
            </tr>
            <#if api.operations[0].params?exists>
                <#list api.operations[0].params as param >
                    <tr>
                        <td colspan="3">${param.field}</td>
                        <td colspan="3">${param.required?string('是', '否')}</td>
                        <td colspan="3">${param.type}</td>
                        <td colspan="3">${param.describe}</td>
                    </tr>
                </#list>
            </#if>
            <#if api.operations[0].paramsBody?exists>
                <#if api.operations[0].paramsBody.fields?exists>
                    <#list api.operations[0].paramsBody.fields as item>
                        <tr>
                            <td colspan="3">${item.field}</td>
                            <td colspan="3">${item.required?string('是', '否')}</td>
                            <td colspan="3">${item.type}</td>
                            <td colspan="3">${item.describe}</td>
                        </tr>
                    </#list>
                </#if>
            </#if>
            <tr>
                <th>提交数据举例</th>
                <td colspan="12">
                    {<br>
                    <#if api.operations[0].params?exists>
                        <#list api.operations[0].params as param >
                            &nbsp;&nbsp;"${param.field}": <br>
                        </#list>
                    </#if>
                    <#if api.operations[0].paramsBody?exists>
                        <#if api.operations[0].paramsBody.fields?exists>
                            <#list api.operations[0].paramsBody.fields as item>
                                &nbsp;&nbsp;"${item.field}": <br>
                            </#list>
                        </#if>
                    </#if>
                    }<br>
                </td>
            </tr>
            <tr>
                <th>返回Http状态</th>
                <td colspan="12">200</td>
            </tr>
            <tr>
                <th rowspan=2>返回数据参数</th>
                <th colspan="4">名称</th>
                <th colspan="4">类型</th>
                <th colspan="4">描述</th>
            </tr>
            <tr>
                <td colspan="12">
                    ...<br>
                </td>
            </tr>
            <tr>
                <th>返回数据举例（处理正常）</th>
                <td colspan="12">
                    {<br>
                    &nbsp;&nbsp;...<br>
                    }<br>
                </td>
            </tr>
        </table>
        <br>
    </#list>

</#list>
