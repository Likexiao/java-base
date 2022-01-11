package com.java.base.redis.RedisArticle;

import redis.clients.jedis.Jedis;

public class RedisArticleTest {
    public static void main(String[] args) {
        Jedis jedis = RedisSingle.getRedis();
        Article article = Article.builder()
                .title("为何《我的祖国》成为最感人的歌？")
                .dec("人民日报社")
                .content("国产故事片《上甘岭》镜头之一:坚守在上甘岭的英雄们——张连长(右二)、通讯员杨德才(右一)、卫生员王兰(左二)。　新华社发\n" +
                        "\n" +
                        "近日，新华社联合知乎发起“你好中国·问答70年”活动，首席提问官胡歌发出第一个提问，邀请知友们参与讨论：“新中国成立70年来，有没有一首歌，让你听了就热泪盈眶？”\n" +
                        "\n" +
                        "众多网友不约而同选择了一首歌——《我的祖国》。\n" +
                        "\n" +
                        "一\n" +
                        "\n" +
                        "时间会湮没许多记忆，但有些其实并未消失，只待一个密码，顷刻激活。对于中国人来说，《我的祖国》这首歌，就是一个激活集体记忆的“密码”。“一条大河波浪宽……”当熟悉的旋律响起，人们会情不自禁跟着唱起来，或者脑海里开始浮现一些画面、许多往事，在旋律中挺直脊梁。\n" +
                        "\n" +
                        "《我的祖国》这首歌，是跟一部电影紧密相关的，这部电影叫《上甘岭》，于1956年12月1日上映，虽然讲的是一个连队的故事，却还原了1952年10月14日至11月25日的上甘岭战役之残酷与壮烈。在激烈的战斗间歇，狭窄的地下坑道内，志愿军卫生员王兰唱起了《我的祖国》这首歌，鏖战多日、伤痕累累的志愿军战士们，在歌声中昂起头来，眼眸清亮。《上甘岭》是一部黑白电影，没有今天令人眩目的特效，演员也很质朴，但这个场景，成为几代中国人无法忘怀的经典：")
                .build();
        jedis.set("article".getBytes(),RedisSingle.serializable(article));
        byte[] result =  jedis.get("article".getBytes());
        System.out.println(result);
        Article tran = (Article) RedisSingle.unSerializable(result);
        System.out.println(tran.getContent());

    }
}
