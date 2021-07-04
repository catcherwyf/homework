/*
 * Copyright 2017-2021 Dromara.org

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.catcher.dubbohmilytcc.mapper;

import com.catcher.dubbohmilytcc.entity.AccountDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * The interface Account mapper.
 *
 * @author xiaoyu
 */
@Mapper
@Repository
public interface AccountMapper {
    
    /**
     * Update int.
     *
     * @param account the account dto
     * @return the int
     */
    @Update("update account set cn_amount = cn_amount - #{cnAmount}," +
            " us_amount= us_amount + #{usAmount} ,update_time = now()" +
            " where user_id =#{userId}  and  cn_amount >= #{cnAmount}  ")
    int update(AccountDO account);

    
    /**
     * 根据userId获取用户账户信息
     *
     * @param userId 用户id
     * @return AccountDO account do
     */
    @Select("select id,user_id,cn_amount, us_amount from account where user_id =#{userId} limit 1")
    AccountDO findByUserId(String userId);
}
