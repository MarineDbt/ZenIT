package ConnectionToPersistence;

public abstract class  AbstractPersistenceHandlerFactory{
	
	/* Attributes */
	
	private static AbstractPersistenceHandlerFactory myPersistenceHandlerFactory;
	
	/* Creation Method */
	
	public static AbstractPersistenceHandlerFactory getFactory()
	{
		return myPersistenceHandlerFactory;
	}
	
	public static void setFactory(AbstractPersistenceHandlerFactory persistenceHandlerFactory)
	{
		if (myPersistenceHandlerFactory==null)
		myPersistenceHandlerFactory=persistenceHandlerFactory;
	}
	
	/* Creation methods for PersistenceHandler */
	
	//public abstract SupervisorPersistenceHandler createSupervisorPersistenceHandler();

	public abstract UserAbstractPersistenceHandler createUserPersistenceHandler();
	
	//public abstract ContributorPersistenceHandler createContributorPersistenceHandler();
	
	//public abstract AdminPersistenceHandler createAdminPersistenceHandler();
	
	//public abstract MemberPersistenceHandler createMemberPersistenceHandler();
	
	public abstract ShoppingAbstractPersistenceHandler createShoppingPersistenceHandler();
	
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
