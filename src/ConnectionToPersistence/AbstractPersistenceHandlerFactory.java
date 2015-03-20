package ConnectionToPersistence;

public abstract class  AbstractPersistenceHandlerFactory{
	
	/* Attributes */
	
	private static AbstractPersistenceHandlerFactory myAbstractFactory;
	
	/* Creation Method */
	
	public static AbstractPersistenceHandlerFactory createFactory()
	{
		return myAbstractFactory;
	}
	
	/* Creation methods for PersistenceHandler */
	
	//public abstract SupervisorPersistenceHandler createSupervisorPersistenceHandler();

	public abstract UserAbstractPersistenceHandler createUserPersistenceHandler();
	
	//public abstract ContributorPersistenceHandler createContributorPersistenceHandler();
	
	//public abstract AdminPersistenceHandler createAdminPersistenceHandler();
	
	//public abstract MemberPersistenceHandler createMemberPersistenceHandler();
	
	public abstract ShoppingAbstractPersistanceHandler createShoppingPersistenceHandler();
	
	public abstract NotificationAbstractPersistenceHandler createNotificationPersistenceHandler();
	
	//public abstract RoomPersistenceHandler createRoomPersistenceHandler();
	
	//public abstract CategoryPersistenceHandler createCategoryPersistenceHandler();
	
	//public abstract MyActivitesPersistenceHandler createMyActivitiesPersistenceHandler();
	
	//public abstract EventPersistenceHandler createEventPersistenceHandler();
	
	//public abstract ActivityPersistenceHandler createActivityPersistenceHandler();
	
	//public abstract OrderPersistenceHandler createOrderPersistenceHandler();
	
	//public abstract ProductPersistenceHandler createProductPersistenceHandler();
	
	//public abstract AdhesionPersistenceHandler createAdhesionPersistenceHandler();
}
