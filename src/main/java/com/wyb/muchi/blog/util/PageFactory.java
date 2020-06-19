package com.wyb.muchi.blog.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wyb.muchi.blog.support.BaseQuery;

public class PageFactory {
        public static<T> Page<T> defaultPage(BaseQuery query) {
            if (query == null) {
                query = new BaseQuery();
            }
            return new Page<>(query.getPageIndex(), query.getPageSize());
        }
    }
