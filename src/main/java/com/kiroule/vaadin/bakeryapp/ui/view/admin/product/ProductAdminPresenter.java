package com.kiroule.vaadin.bakeryapp.ui.view.admin.product;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import com.kiroule.vaadin.bakeryapp.backend.data.entity.Product;
import com.kiroule.vaadin.bakeryapp.backend.service.ProductService;
import com.kiroule.vaadin.bakeryapp.ui.navigation.NavigationManager;
import com.kiroule.vaadin.bakeryapp.ui.view.admin.AbstractCrudPresenter;

@SpringComponent
@ViewScope
public class ProductAdminPresenter extends AbstractCrudPresenter<Product, ProductService, ProductAdminView> {

	@Autowired
	public ProductAdminPresenter(ProductAdminDataProvider productAdminDataProvider, NavigationManager navigationManager,
			ProductService service, BeanFactory beanFactory) {
		super(navigationManager, service, Product.class, productAdminDataProvider, beanFactory);
	}
}
