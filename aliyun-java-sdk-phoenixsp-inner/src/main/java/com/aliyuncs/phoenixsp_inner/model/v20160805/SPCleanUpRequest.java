/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SPCleanUpRequest extends RpcAcsRequest<SPCleanUpResponse> {
	
	public SPCleanUpRequest() {
		super("Phoenixsp-inner", "2016-08-05", "SPCleanUp");
	}

	private Long userId;

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	@Override
	public Class<SPCleanUpResponse> getResponseClass() {
		return SPCleanUpResponse.class;
	}

}
