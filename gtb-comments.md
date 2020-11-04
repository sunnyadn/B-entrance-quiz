### 完成度：
* 整体完成度不错，维度 group 里没有 name，有点遗憾
* 具体验收测试结果详见：`gtb-test-results.md`

__Details:__

- \- GroupService.java:49 group 里的 members 不需要排序

### 测试：
* 没有测试。

__Details:__



### 知识点：
* 整体没有太问题。

__Details:__

- \- GroupService.java:15 现在可以不用在这里写 @Autowired 了

### 工程实践：
* 建议开始使用 lombok
* 尝试再简化以下下面的分配算法

__Details:__
+ \+ MemberRequest.java:6 单独提取了 MemberRequest，命名可以更具体，比如 CreateMemberRequest
- \- GroupResource.java:22 字段放前面
- \- MemberService.java:12 可以把List<Member> members封装成 MemberRepository。Group 那边同理。

### 综合：
* 整体来说很好。某些细节上的问题见具体comments。

__Details:__



