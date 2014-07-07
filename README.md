FreeSitemesh
============

sitemesh扩展标签库，简化页面模版定义,实现页面继承的概念， 支持模板嵌套

在原生的sitemesh上扩展了几个标签：

<sm:template> 定义引用的模板路径

<sm:insert> 定义模板页面的插入点，可以有默认内容

<sm:component> 定义子页面的内容块，替换对应的模板插入点

<sm:attr> 子页面可以用该标签定义request的属性值，只能被当前页面和上层的模板页面使用






