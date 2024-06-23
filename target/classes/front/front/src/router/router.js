import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yishengList from '../pages/yisheng/list'
import yishengDetail from '../pages/yisheng/detail'
import yishengAdd from '../pages/yisheng/add'
import keshifenleiList from '../pages/keshifenlei/list'
import keshifenleiDetail from '../pages/keshifenlei/detail'
import keshifenleiAdd from '../pages/keshifenlei/add'
import huanzhedanganList from '../pages/huanzhedangan/list'
import huanzhedanganDetail from '../pages/huanzhedangan/detail'
import huanzhedanganAdd from '../pages/huanzhedangan/add'
import keshixinxiList from '../pages/keshixinxi/list'
import keshixinxiDetail from '../pages/keshixinxi/detail'
import keshixinxiAdd from '../pages/keshixinxi/add'
import yuyueguahaoList from '../pages/yuyueguahao/list'
import yuyueguahaoDetail from '../pages/yuyueguahao/detail'
import yuyueguahaoAdd from '../pages/yuyueguahao/add'
import jiuzhenxinxiList from '../pages/jiuzhenxinxi/list'
import jiuzhenxinxiDetail from '../pages/jiuzhenxinxi/detail'
import jiuzhenxinxiAdd from '../pages/jiuzhenxinxi/add'
import yaofangxinxiList from '../pages/yaofangxinxi/list'
import yaofangxinxiDetail from '../pages/yaofangxinxi/detail'
import yaofangxinxiAdd from '../pages/yaofangxinxi/add'
import zixunxinxiList from '../pages/zixunxinxi/list'
import zixunxinxiDetail from '../pages/zixunxinxi/detail'
import zixunxinxiAdd from '../pages/zixunxinxi/add'
import huifuxinxiList from '../pages/huifuxinxi/list'
import huifuxinxiDetail from '../pages/huifuxinxi/detail'
import huifuxinxiAdd from '../pages/huifuxinxi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yisheng',
					component: yishengList
				},
				{
					path: 'yishengDetail',
					component: yishengDetail
				},
				{
					path: 'yishengAdd',
					component: yishengAdd
				},
				{
					path: 'keshifenlei',
					component: keshifenleiList
				},
				{
					path: 'keshifenleiDetail',
					component: keshifenleiDetail
				},
				{
					path: 'keshifenleiAdd',
					component: keshifenleiAdd
				},
				{
					path: 'huanzhedangan',
					component: huanzhedanganList
				},
				{
					path: 'huanzhedanganDetail',
					component: huanzhedanganDetail
				},
				{
					path: 'huanzhedanganAdd',
					component: huanzhedanganAdd
				},
				{
					path: 'keshixinxi',
					component: keshixinxiList
				},
				{
					path: 'keshixinxiDetail',
					component: keshixinxiDetail
				},
				{
					path: 'keshixinxiAdd',
					component: keshixinxiAdd
				},
				{
					path: 'yuyueguahao',
					component: yuyueguahaoList
				},
				{
					path: 'yuyueguahaoDetail',
					component: yuyueguahaoDetail
				},
				{
					path: 'yuyueguahaoAdd',
					component: yuyueguahaoAdd
				},
				{
					path: 'jiuzhenxinxi',
					component: jiuzhenxinxiList
				},
				{
					path: 'jiuzhenxinxiDetail',
					component: jiuzhenxinxiDetail
				},
				{
					path: 'jiuzhenxinxiAdd',
					component: jiuzhenxinxiAdd
				},
				{
					path: 'yaofangxinxi',
					component: yaofangxinxiList
				},
				{
					path: 'yaofangxinxiDetail',
					component: yaofangxinxiDetail
				},
				{
					path: 'yaofangxinxiAdd',
					component: yaofangxinxiAdd
				},
				{
					path: 'zixunxinxi',
					component: zixunxinxiList
				},
				{
					path: 'zixunxinxiDetail',
					component: zixunxinxiDetail
				},
				{
					path: 'zixunxinxiAdd',
					component: zixunxinxiAdd
				},
				{
					path: 'huifuxinxi',
					component: huifuxinxiList
				},
				{
					path: 'huifuxinxiDetail',
					component: huifuxinxiDetail
				},
				{
					path: 'huifuxinxiAdd',
					component: huifuxinxiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
