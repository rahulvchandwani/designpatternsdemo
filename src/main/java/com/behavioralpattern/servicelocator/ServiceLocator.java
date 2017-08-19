package com.behavioralpattern.servicelocator;

public class ServiceLocator {
	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String serviceName) {
		Service serviceFromCache = cache.getService(serviceName);

		if (serviceFromCache != null) {
			return serviceFromCache;
		}

		InitialContext context = new InitialContext();
		Service serviceFromContext = (Service) context.lookup(serviceName);
		cache.addService(serviceFromContext);
		return serviceFromContext;
	}
}
