/*******************************************************************************
 * 	Copyright 2018 Huawei Technologies Co.,Ltd.
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.huawei.openstack4j.openstack.bss.v1.internal;

import com.huawei.openstack4j.api.Apis;

public class BusinessSupportSystemService extends BaseBusinessSupportSystemService
{

    public CustomerManagementService customerManagementService()
    {
        return Apis.get(CustomerManagementService.class);
    }

    public UtilitiesService utilitiesService() { return Apis.get(UtilitiesService.class); }

    public BillService billService() { return Apis.get(BillService.class); }

    public EnquiryService enquiryService() { return  Apis.get(EnquiryService.class); }

    public RealnameAuthService realnameAuthService()
    {
        return Apis.get(RealnameAuthService.class);
    }

    public PayPerUseResourceService payPerUseResourceService()
    {
        return Apis.get(PayPerUseResourceService.class);
    }

    public PeriodOrderService periodOrderService()
    {
        return Apis.get(PeriodOrderService.class);
    }

    public PeriodResourceService periodResourceService()
    {
        return Apis.get(PeriodResourceService.class);
    }
}
