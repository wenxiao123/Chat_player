package com.amap.map3d.demo.chat_player.model;

import cn.bmob.newim.listener.BmobListener1;
import cn.bmob.v3.exception.BmobException;

/**
 * @author :
 * @project:
 * @date :2016-02-01-16:23
 */
public abstract class UpdateCacheListener extends BmobListener1 {
    public abstract void done(BmobException e);

    @Override
    protected void postDone(Object o, BmobException e) {
        done(e);
    }
}
