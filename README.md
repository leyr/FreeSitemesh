FreeSitemesh
============

sitemesh扩展标签库，简化页面模版定义,实现页面继承的概念， 支持模板嵌套。

支持jsp、html、freemark、velocity等任意视图文件格式。

目前扩展的标签有：

  <sm:template> 定义引用的模板路径
  
  <sm:insert> 定义模板页面的插入点，可以有默认内容
  
  <sm:component> 定义子页面的内容块，替换对应的模板插入点
  
  <sm:attr> 子页面可以用该标签定义request的属性值，只能被当前页面和上层的模板页面使用



使用指南： https://github.com/leyr/FreeSitemesh/wiki/FreeSitemesh%E4%BD%BF%E7%94%A8%E6%8C%87%E5%8D%97

运行时依赖sitemesh 3.0以上以及servlet-api 2.4以上




