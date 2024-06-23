const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot8jjp4y66/",
            name: "springboot8jjp4y66",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot8jjp4y66/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区医院管理系统"
        } 
    }
}
export default base
