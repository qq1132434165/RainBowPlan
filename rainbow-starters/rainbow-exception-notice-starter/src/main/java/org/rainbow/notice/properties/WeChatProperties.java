package org.rainbow.notice.properties;

import lombok.Data;
import org.rainbow.notice.enums.WeChatMsgTypeEnum;

/**
 * 企业微信机器人配置
 *
 * @author K
 * @date 2021/2/22  18:24
 */
@Data
public class WeChatProperties {

    /**
     * userid的列表，提醒群中的指定成员(@某个成员)，@all表示提醒所有人，如果开发者获取不到userid，可以使用atPhones
     */
    private String[] atUserIds;

    /**
     * 手机号列表，提醒手机号对应的群成员(@某个成员)，@all表示提醒所有人
     */
    private String[] atPhones;

    /**
     * 企业微信机器人webhook地址
     */
    private String webHook;

    /**
     * 消息类型
     */
    private WeChatMsgTypeEnum msgType = WeChatMsgTypeEnum.TEXT;
}
