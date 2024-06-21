
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import ReviewReivewManager from "./components/listers/ReviewReivewCards"
import ReviewReivewDetail from "./components/listers/ReviewReivewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/reviews/reivews',
                name: 'ReviewReivewManager',
                component: ReviewReivewManager
            },
            {
                path: '/reviews/reivews/:id',
                name: 'ReviewReivewDetail',
                component: ReviewReivewDetail
            },



    ]
})
